package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseIterator implements Iterator {

    ArrayList items;
    int poz = 0;
    public PancakeHouseIterator(ArrayList items) {
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        if ((poz >= items.size()) || (items.get(poz) == null)) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) items.get(poz);
        poz = poz + 1;
        return menuItem;
    }
    public void remove() {
        if (poz <= 0) {
            throw new IllegalStateException
                    ("You can’t remove an item until you’ve done at least one next()");
        }
        if (items.get(poz - 1) != null) {
            for (int i = poz - 1; i < (items.size() - 1); i++) {
                items.set(i, items.get(i + 1));
            }
            items.set(items.size() - 1, null);
        }
    }
}
