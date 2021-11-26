package abstractFactory;

public class AndroidFactory implements OSFactory {

    public Phone create(ManufacturerType manufacturerType) {
        switch (manufacturerType) {
            case GOOGLE:
                return new GooglePhone();
            case ONEPLUS:
                return new OnePlus5T();

            default:
                return createDefault();
        }
    }

    @Override
    public Phone createDefault() {
        return new GooglePhone();
    }
}