package ua.myCompany.lessons.lesson9.example2.entity;

public class UserEntity {
    public AddressEntity getAddressEntity() {
        return addressEntity;
    }

    public UserEntity(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }

    private final AddressEntity addressEntity;
}
