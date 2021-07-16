package javawebui3.features.expences;

import javawebui3.base.BaseUITest;
import javawebui3.common.Configuration;
import javawebui3.enums.ContactSubMenuButtons;
import javawebui3.enums.NavigationBarTabs;

import javawebui3.pages.ContactsPage;
import javawebui3.pages.LoginPage;

import javawebui3.views.ContactFacesSubMenu;
import org.junit.jupiter.api.Test;

import static javawebui3.enums.ContactSubMenuButtons.*;

public class NewContactPositiveTest extends BaseUITest {
    private static final String LAST_NAME = "Локи";
    private static final String FIRST_NAME = "Лафейсон";
    private static final String POSITION = "Бог обмана";

    @Test
    public void createNewProjectPositiveTest() {
        ContactsPage expensesScreen1 = (ContactsPage) new LoginPage(driver)
                .authoriseScenario(Configuration.STUDENT_LOGIN, Configuration.STUDENT_PASSWORD)
                .getPageNavigation()
                .moveCursorToNavigationTab1(NavigationBarTabs.COUNTER_PARTIES)
                .clickSubMenuButton(ContactSubMenuButtons.CONTACT_FACES);




        expensesScreen1
                .clickOnCreateNewContactButton()
                .enterLastNameInput(LAST_NAME)
                .enterFirstNameInput(FIRST_NAME)
                .clickNameOrgContSelect()
                .clickOptionOrgContSelect()
                .enterPositionInput(POSITION)
                .clickCreateContactButton();

    }
}