package ua.myCompany.lessons.lesson9.example2.entity;

public class AddressEntity {
    public CityEntity getCityEntity() {
        return cityEntity;
    }

    public AddressEntity(CityEntity cityEntity) {
        this.cityEntity = cityEntity;
    }

    private final CityEntity cityEntity;
}
