public class Machine {
    private Item[][] items;

    public Machine(Item[][] items) {
        this.items = new Item[items.length][items[0].length];
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                this.items[i][j] = new Item(items[i][j]);
            }
        }
    }
    
    public Item getItem(int row, int spot) {
        return new Item(this.items[row][spot]);
    }

    public void setItem(Item item, int row, int spot) {
        this.items[row][spot] = new Item(item);
    }
    
    /**
     * Function name – dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     * 
     * Inside the function:
     *  1. Checks if the requested item has a quantity bigger than 0.
     *      • if so: decreases its quantity by one and returns true.
     *      • otherwise: returns false.
     */
    public boolean dispense(int row, int spot) {
        //Item item = this.items[row][spot];
        int qty = this.items[row][spot].getQuantity();
        if( qty > 0) {
            this.items[row][spot].setQuantity(qty - 1);
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String s = "";

            for (int i = 0; i < items.length; i++) {
                s += "\t";
                for (int j = 0; j < items.length; j++) {
                    s += items[i][j];
                    s += " ";
                }
                s += "\n\n";
            }
            s += "\t************************************************\n";
            return s;
    }
}
