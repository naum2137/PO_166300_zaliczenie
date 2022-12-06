from court import *


class Stadion(Court):
    __name: str
    __common_name: str  # opcional
    __capacity: int

    def __init__(self, width: float = 68, length: float = 150, adress: str = None, year_built: int = 0,
                 name: str = None,  capacity: int = 0, common_name: str = None) -> None:
        super().__init__(width, length, adress, year_built)
        self.__name = name
        self.__common_name = common_name
        if capacity < 0:
            self.__capacity = 0
        else:
            self.__capacity = capacity

    @property
    def name(self) -> str:
        return self.__name

    @property
    def common_name(self) -> str:
        return self.__common_name

    @property
    def capasity(self) -> int:
        return self.__capacity

    @name.setter
    def name(self, value: str) -> None:
        self.__name = value

    @common_name.setter
    def common_name(self, value: str) -> None:
        self.__common_name = value

    @capasity.setter
    def capasity(self, value) -> None:
        if value < 0:
            raise ValueError("pojemnosc musi byc wiekrza lub rowna 0")
        else:
            self.__capacity = value

    def __eq__(self, other: 'Stadion') -> bool:
        if self.area() == other.area() and self.__capacity == other.__capacity:
            return True
        else:
            return False

    def __ne__(self, other: 'Stadion') -> bool:
        if not self == other:
            return True
        else:
            return False

    def __str__(self):
        if self.__common_name is not None:
            return f'Boisko wybudowane w roku {self.year_built}, o długości {self.lenght} metrów i szerokości {self.width} metrów.\n' \
                   f'Pole powierzchni: {self.area()} mkw.\n' \
                   f'Adres: {self.adress}\n' \
                   f'Nazwa zwyczajowa: {self.common_name}\n' \
                   f'Pojemność stadionu: {self.capasity} osób.'
        else:
            return f'Boisko wybudowane w roku {self.year_built}, o długości {self.lenght} metrów i szerokości {self.width} metrów.\n' \
                   f'Pole powierzchni: {self.area()} mkw.\n' \
                   f'Adres: {self.adress}\n' \
                   f'Nazwa: {self.name}\n' \
                   f'Pojemność stadionu: {self.capasity} osób.'
