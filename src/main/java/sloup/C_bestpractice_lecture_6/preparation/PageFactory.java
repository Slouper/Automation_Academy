package sloup.C_bestpractice_lecture_6.preparation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public interface PageFactory {


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
