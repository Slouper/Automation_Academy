package sloup.C_bestpractice_lecture_6.preparation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public interface PageFactory {

    /**
     * Receives pageClass as parameter
     * Example: createPage(SeznamHomePage.class)
     * <p>
     *
     * @param pageClass
     * @param <T>
     * @return
     */
    static <T extends BasePage> T createPage(Class<T> pageClass) {
        T pageObject = null;

        try {
            Constructor<T> pageInstance = pageClass.getConstructor();
            pageObject = pageInstance.newInstance();
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
        if (pageObject != null) {
            pageObject.waitForPageLoaded();
            pageObject.checkPageIsOpen();
        }
        return pageObject;
    }

    /**
     * Not neccessary to send page as parameter
     * <p>
     * Examples:
     * <p>
     * 1) Call method with Type neference <PageObjectType>
     * <p>
     * this.<SeznamHomePage>createPage().searchExpressionOnSeznamHomePage("Selenium WebDriver");
     * <p>
     * 2) Takes page type according to return type of calling method:
     * <p>
     * public SeznamSearchResultsPage searchExpressionOnSeznamHomePage(String searchedExpression) {
     * searchInputField.sendKeys(searchedExpression);
     * searchButton.click();
     * return createPage();
     * }
     *
     * @param page
     * @param <T>
     * @return
     */
    @SuppressWarnings("unchecked")
    @SafeVarargs
    static <T extends BasePage> T createPage(T... page) {
        T pageObject = null;

        try {
            Class<T> pageInstance = (Class<T>) page.getClass().getComponentType();
            pageObject = pageInstance.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        // Check that page is fully loaded and open
        if (pageObject != null) {
            pageObject.waitForPageLoaded();
            pageObject.checkPageIsOpen();
        }
        return pageObject;
    }

}
