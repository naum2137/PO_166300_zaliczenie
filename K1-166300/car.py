from vehicle import *


class Car(Vehicle):
    __price: float
    __color: str
    __extra_seats: int

    def __init__(self, reg: str = None, model: int = 0, prod_year: int = 2022, price: float = 0,
                 color: str = None, extra_seats: int = 0) -> None:
        super().__init__(reg, model, prod_year)

        if price < 0:
            self.__price = 0
        else:
            self.__price = price

        if extra_seats < 0:
            self.__extra_seats = 0
        else:
            self.__extra_seats = extra_seats

        self.__color = color

    @property
    def price(self) -> float:
        return self.__price

    @property
    def extra_seats(self) -> int:
        return self.__extra_seats

    @property
    def color(self) -> str:
        return self.__color

    @price.setter
    def price(self, value: float) -> None:
        if value < 0:
            raise ValueError('cena nie moze byc ujemna')
        else:
            self.__price = value

    @extra_seats.setter
    def extra_seats(self, value: int) -> None:
        if value < 0:
            raise ValueError('dodatkowe siedzenia nie moze byc mniejsza niz 0')
        else:
            self.__extra_seats = value

    @color.setter
    def color(self, value: str) -> None:
        self.__color = value

    def drive(self):
        return f'Jadę swietnym pojazdem z roku {self.prod_year}! Ma kolor {self.color}'

    def __eq__(self, other: 'Car') -> bool:
        if self.model == other.model and self.__price == other.__price:
            return True
        else:
            return False

    def __ne__(self, other: 'Car') -> bool:
        if self.model != other.model or self.__price != other.__price:
            return True
        else:
            return False

    def __str__(self):
        if self.reg is not None:
            return f'Pojazd wyprodukowany w roku: {self.prod_year}.\n' \
                   f'Model {self.model}.\n' \
                   f'Rejestracja: {self.reg}.\n' \
                   f'Cena: {self.price}.\n' \
                   f'kolor: {self.color}.\n' \
                   f'Dodatkowe siedzenia: {self.extra_seats}.'
        else:
            return f'Pojazd wyprodukowany w roku: {self.prod_year}.\n' \
                   f'Model {self.model}.\n' \
                   f'Cena: {self.price}.\n' \
                   f'kolor: {self.color}.\n' \
                   f'Dodatkowe siedzenia: {self.extra_seats}.'
