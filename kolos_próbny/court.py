import datetime


class Court:

    __width: float
    __length: float
    __adress: str
    __year_built: int

    def __init__(self, width: float = 68, length: float = 150, adress: str = None, year_built: int = 0):
        if width < 45 or width > 90 or length < 90 or length > 120:
            self.__width = 68
            self.__length = 150
        else:
            self.__width = width
            self.__length = length

        self.__adress = adress
        self.__year_built = year_built

    @property
    def width(self) -> float:
        return self.__width

    @property
    def lenght(self) -> float:
        return self.__length

    @property
    def adress(self) -> str:
        return self.__adress

    @property
    def year_built(self) -> int:
        return self.__year_built

    @width.setter
    def width(self, value: float) -> None:
        if value >= 45 and value <= 90:
            self.__width = value
        else:
            raise ValueError("podana wartosc musi byc z przedzialu (45;90)")

    @lenght.setter
    def lenght(self, value: float) -> None:
        if value >= 90 and value <= 120:
            self.__length = value
        else:
            raise ValueError("podana wartosc musi byc z przedzialu (90;120)")

    @adress.setter
    def adress(self, value: str) -> None:
        self.__adress = value

    @year_built.setter
    def year_built(self, value: int) -> None:
        self.__year_built = value

    def area(self):
        return self.__width * self.__length

    @staticmethod
    def validate(court: 'Court'):
        year = int(datetime.date.today().year)
        if court.__year_built > year or court.__year_built < 0:
            court.__year_built = year

    def __str__(self) -> str:
        return f'Boisko wybudowane w roku {self.__year_built}, o długości {self.__length} metrów'\
               f'i szerokości {self.__width} metrów. \n' \
               f'Pole powierzchni: {self.area()} mkw.\n' \
               f'Adres: {self.__adress}.'

    def __eq__(self, other: 'Court') -> bool:
        if self.area() == other.area:
            return True
        else:
            return False

    def __ne__(self, other: 'Court') -> bool:
        if self.area() != other.area():
            return True
        else:
            return False
