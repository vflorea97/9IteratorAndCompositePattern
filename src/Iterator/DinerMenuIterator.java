package Iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int poz = 0;
    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }
    public Object next() {
        MenuItem menuItem = items[poz];
        poz += 1;
        return menuItem;
    }
    public boolean hasNext() {
        if (poz >= items.length || items[poz] == null) {
            return false;
        } else {
            return true;
        }
    }
    public void remove() {
        if (poz <= 0) {
            throw new IllegalStateException
                    ("You can’t remove an item until you’ve done at least one next()");
        }
        if (items[poz - 1] != null) {
            for (int i = poz - 1; i < (items.length - 1); i++) {
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null;
        }
    }
}
