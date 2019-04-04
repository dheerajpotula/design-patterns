import com.potulad.learning.designpatterns.proxy.protection.PersonBean;
import com.potulad.learning.designpatterns.proxy.protection.ProxySimpleFactory;

public class RemoteProxyPatternTest {

    private static final ProxySimpleFactory proxyFactory = new ProxySimpleFactory();

    public static void main(String args[]) {
         PersonBean joeAccessingHimself = proxyFactory.getPersonBean("joe", "joe");
         doOwnerOperations(joeAccessingHimself, null, null);
         doOwnerOperations(joeAccessingHimself, "joe1", "M/F");

         PersonBean kateAccessingJoe = proxyFactory.getPersonBean("kate", "joe");
         doNonOwnerOperations(kateAccessingJoe, 9);

         PersonBean brianAccessingJoe = proxyFactory.getPersonBean("brian", "joe");
         doNonOwnerOperations(brianAccessingJoe, 8);

         doOwnerSettingHisOwnRating(joeAccessingHimself);
         doNonOwnerSettingSomeoneElseProfile(kateAccessingJoe);
    }

    private static void doOwnerOperations(PersonBean personBean, String newName, String newGender) {
        doUniversalOperations(personBean);

        if(newName != null && !newName.isEmpty()) {
            personBean.setName(newName);
        }

        if(newGender != null && !newGender.isEmpty()) {
            personBean.setGender(newGender);
        }

        doUniversalOperations(personBean);
    }

    private static void doNonOwnerOperations(PersonBean personBean, int newHotOrNotRating) {
        doUniversalOperations(personBean);

        personBean.setHotOrNotRating(newHotOrNotRating);

        doUniversalOperations(personBean);
    }

    private static void doOwnerSettingHisOwnRating(PersonBean personBean) {
        doUniversalOperations(personBean);

        try {
            personBean.setHotOrNotRating(1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void doNonOwnerSettingSomeoneElseProfile(PersonBean personBean) {
        doUniversalOperations(personBean);

        try {
            personBean.setGender("A");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void doUniversalOperations(PersonBean personBean) {
        System.out.println("Profile for " + personBean.getName());
        System.out.println("Gender : " + personBean.getGender());
        System.out.println("Hot Or Not : " + personBean.getHotOrNotRating());
    }
}
