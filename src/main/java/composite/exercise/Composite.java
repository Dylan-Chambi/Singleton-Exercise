package composite.exercise;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private String compositeName;
    private final List<Component> compositeList = new ArrayList<>();
    public Composite(String compositeName) {
        this.compositeName = compositeName;
    }

    public Composite setCompositeName(String compositeName) {
        this.compositeName = compositeName;
        return this;
    }

    public String getCompositeName() {
        return compositeName;
    }

    @Override
    public double getPrecioVenta() {
        double precioVentaTotal = 0;
        for (Component component : compositeList) {
            precioVentaTotal += component.getPrecioVenta();
        }
        return precioVentaTotal;
    }

    @Override
    public String getInfo() {
        String totalInfo = this.compositeName + " > precioVenta: " + this.getPrecioVenta();
        for (Component component : compositeList) {
            totalInfo += ("\n" + component.getInfo());
        }
        return totalInfo.replaceAll("\n", "\n\t");
    }

    @Override
    public void showInfo() {
        System.out.println(this.getInfo());
    }

    public void add(Component component) {
        compositeList.add(component);
    }

    public void remove(Component component) {
        compositeList.remove(component);
    }

    public Component getChild(int position) {
        return compositeList.get(position);
    }
}
