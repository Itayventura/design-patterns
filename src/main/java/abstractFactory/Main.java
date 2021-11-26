package abstractFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        OSFactory windowsFactory = AbstractPhoneFactory.getFactory(OSType.WINDOWS);
        OSFactory androidFactory = AbstractPhoneFactory.getFactory(OSType.ANDROID);
        List<ManufacturerType> windowsTypes = List.of(ManufacturerType.LENOVO, ManufacturerType.MICROSOFT);
        List<ManufacturerType> androidTypes = List.of(ManufacturerType.GOOGLE, ManufacturerType.ONEPLUS);

        windowsTypes.stream()
                .map(windowsFactory::create)
                .forEach(Phone::display);
        androidTypes.stream()
                .map(androidFactory::create)
                .forEach(Phone::display);
    }
}
