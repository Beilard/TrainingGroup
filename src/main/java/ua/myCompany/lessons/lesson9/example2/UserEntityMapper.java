package ua.myCompany.lessons.lesson9.example2;

import ua.myCompany.lessons.lesson9.example2.domain.Address;
import ua.myCompany.lessons.lesson9.example2.domain.City;
import ua.myCompany.lessons.lesson9.example2.domain.User;
import ua.myCompany.lessons.lesson9.example2.entity.AddressEntity;
import ua.myCompany.lessons.lesson9.example2.entity.CityEntity;
import ua.myCompany.lessons.lesson9.example2.entity.UserEntity;

import java.util.Optional;

public class UserEntityMapper {
    private User mapUserEntityToUser(UserEntity userEntity) {
        if (userEntity == null) {
            return null;
        }

        AddressEntity addressEntity = userEntity.getAddressEntity();
        if (addressEntity == null) {
            return new User(null);
        }

        CityEntity cityEntity = addressEntity.getCityEntity();
        if (cityEntity == null) {
            return new User(null);
        }

        String name = cityEntity.getName();

        return new User(new Address(new City(name)));
    }

    public UserEntity mapUserToUserEntity(User user) {
        String name = Optional.ofNullable(user)
                .map(u->u.getAddress())
                .map(address->address.getCity())
                .map(city->city.getName())
                .orElse(null);
        return new UserEntity(new AddressEntity(new CityEntity(name)));
    }
}
