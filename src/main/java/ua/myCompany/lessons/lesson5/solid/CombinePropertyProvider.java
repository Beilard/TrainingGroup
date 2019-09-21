package ua.myCompany.lessons.lesson5.solid;

public class CombinePropertyProvider {
    private final PropertyProvider envPropertyProvider;
    private final PropertyProvider defaultPropertyProvider;

    public CombinePropertyProvider(PropertyProvider envPropertyProvider,
                                   PropertyProvider defaultPropertyProvider) {
        this.envPropertyProvider = envPropertyProvider;
        this.defaultPropertyProvider = defaultPropertyProvider;
    }

//    public String getProperty(String propertyName) {
//        String propertyBalue = envPropertyProvider.getProperty(PropertyName);
//
//    }
}

