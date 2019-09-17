package converter;

import entity.Address;
import org.springframework.core.convert.converter.Converter;

import javax.management.RuntimeErrorException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String2AddressConverter implements Converter<String, Address> {

    @Override
    public Address convert(String s) {
        Pattern pattern = Pattern.compile("\\[(.*)-(.*)\\]");
        Matcher matcher = pattern.matcher(s);
        if(matcher.matches()){
            String city = matcher.group(2);
            String province = matcher.group(1);
            Address address = new Address();
            address.setCity(city);
            address.setProvince(province);
            return address;
        }else {
            throw new RuntimeException("地址转换失败");
        }
    }
}
