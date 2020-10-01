public void newShape(String shape) {

switch (shape) {
    case "Line":
        Shape line = new Line(startX, startY, endX, endY);
    shapes.add(line);
    break;
        case "Oval":
    Shape oval = new Oval(startX, startY, endX, endY);
    shapes.add(oval);
    break;
    case "Rectangle":
    Shape rectangle = new Rectangle(startX, startY, endX, endY);
    shapes.add(rectangle);
    break;
    default:
    System.out.println("ERROR. Check logic.");
    
    }
}