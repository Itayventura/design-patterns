package abstractFactory;

import java.util.List;

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

        System.out.println("\nFIRST PART IS DONE \n");
        System.out.println("\nDEFAULT PHONES: \n");

        List.of(OSType.WINDOWS, OSType.ANDROID)
                .stream()
                .map(AbstractPhoneFactory::getFactory)
                .map(OSFactory::createDefault)
                .forEach(Phone::display);
    }
}
