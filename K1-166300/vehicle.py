class Vehicle:
    __reg: str
    __model: int
    __prod_year: int

    def __init__(self, reg: str = None, model: int = 0, prod_year: int = 2022) -> None:
        if model < 0:
            self.__model = 0
        else:
            self.__model = model

        if prod_year < 1900 or prod_year > 2022:
            self.__prod_year = 2022
        else:
            self.__prod_year = prod_year

        self.__reg = reg

    @property
    def model(self) -> int:
        return self.__model

    @property
    def reg(self) -> str:
        return self.__reg

    @property
    def prod_year(self) -> int:
        return self.__prod_year

    @model.setter
    def model(self, value: int) -> None:
        if value < 0:
            raise ValueError("model nie moze byc mniejszy od 0")
        else:
            self.__model = value

    @reg.setter
    def reg(self, value: str) -> None:
        self.__reg = value

    @prod_year.setter
    def prod_year(self, value: int) -> None:
        if value < 1900 or value > 2022:
            raise ValueError("rok produkcji musi byc w przedziale [1900;2022].")
        else:
            self.__prod_year = value

    def brake(self):
        return f'Zatrzymuję się'

    def drive(self):
        return f'Jadę świetnym pojazdem z roku {self.__prod_year}!'

    def __str__(self):
        if self.__reg is None:
            return f'Pojazd wyprodukowany w roku: {self.__prod_year}.\n' \
                   f'Model: {self.__model}.'
        else:
            return f'Pojazd wyprodukowany w roku: {self.__prod_year}.\n' \
                   f'Model: {self.__model}.\n' \
                   f'Rejestracja: {self.__reg}.'

    def __eq__(self, other: 'Vehicle') -> bool:
        if self.__model == other.__model:
            if self.__prod_year == other.__prod_year:
                return True
            else:
                return False
        else:
            return False

    def __ne__(self, other: 'Vehicle') -> bool:
        if self.__model != other.__model:
            if self.__prod_year != other.__prod_year:
                return True
            else:
                return True
        else:
            return False
