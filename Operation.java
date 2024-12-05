public enum Operation {
    ADDITION {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    SUBTRACTION {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MULTIPLICATION {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVISION {
        @Override
        public double apply(double x, double y) {
            if (y == 0) {
                throw new ArithmeticException("Деление на ноль запрещено!");
            }
            return x / y;
        }
    };

    // Абстрактный метод для выполнения операции
    public abstract double apply(double x, double y);
}
