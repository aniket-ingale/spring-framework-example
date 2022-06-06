package anix;

public class ThirdPartyImpl implements ThirdPartyInterface{
    @Override
    public void apiCall() {
        System.out.println("In ThirdPartyImpl.apiCall method ");
    }
}
