package abstractFactory;

public interface OSFactory {
    Phone create(ManufacturerType manufacturerType);
    Phone createDefault();

}
