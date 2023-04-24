
    public class Punto {
        private final int x;
        private final int y;
        private static int allocations = 0;

        public Punto() {
            x = 0;
            y = 0;
            allocations++;
        }
        public Punto(int x, int y) {
            this.x = x;
            this.y = y;
            allocations++;
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }

        public Punto clone() {
            return new Punto(x, y);
        }

        public static int getAllocationsAndIncrementX() {
            return allocations;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
        public static int getAllocations() {
            return allocations;
        }

    }
