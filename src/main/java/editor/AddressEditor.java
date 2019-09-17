package editor;

import entity.Address;

import java.beans.PropertyEditorSupport;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressEditor extends PropertyEditorSupport {
    @Override
    public String getAsText() {
        Address address = (Address)getValue();
        return "[" + address.getProvince() + "-" + address.getCity() + "]";
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Pattern pattern = Pattern.compile("\\[(.*)-(.*)\\]");
        Matcher matcher = pattern.matcher(text);
        if(matcher.matches()){
            String city = matcher.group(2);
            String province = matcher.group(1);
            Address address = new Address();
            address.setCity(city);
            address.setProvince(province);
            setValue(address);
        }
    }
}
