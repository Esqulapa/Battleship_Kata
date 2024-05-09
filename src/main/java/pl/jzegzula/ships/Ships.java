package pl.jzegzula.ships;

import pl.jzegzula.board.Cell;

public class Ships {

    class Carrier{
        private final Cell firstCell;
        private final Cell secondCell;
        private final Cell thirdCell;
        private final Cell fourthCell;

       private Carrier(Cell firstCell, Cell secondCell, Cell thirdCell, Cell fourthCell) {
            this.firstCell = firstCell;
            this.secondCell = secondCell;
            this.thirdCell = thirdCell;
            this.fourthCell = fourthCell;
        }

        public Carrier createCarrier(Cell firstCell, Cell secondCell, Cell thirdCell, Cell fourthCell) {
           return new Carrier(firstCell, secondCell, thirdCell, fourthCell);
        }
    }


}

