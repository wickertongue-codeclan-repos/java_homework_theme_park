package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getHeight() > 145 && visitor.getAge() > 12;
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        if ( visitor.getHeight() > 200 ) {
            return this.defaultPrice() * 2;
        } else {
            return defaultPrice();
        }
    }
}
