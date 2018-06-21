package Program3;

	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	// Clase de control del ejemplo
	public class aaa extends JFrame{
	public static void main( String[] args ) {
	JFrame f = new JFrame( "Trabajo Final" );
	JTextField tf=new JTextField(15);
	//Container cp=getContentPane();
	// Clase anidada para controlar el cierre de la ventana y
	// concluir la aplicación
	f.addWindowListener( new WindowAdapter() {
	public void windowClosing( WindowEvent evt ) {
	System.exit( 0 );
	}
	});
	// Creamos una instancia de la carita y la incorporamos al Frame
	f.add( new CaraS( Color.yellow),BorderLayout.CENTER );
	f.pack();
	f.setBackground(Color.lightGray);
	// Lo hacemos todo visible en pantalla
	f.setVisible(true);
	}
	}
	class CaraS extends Canvas {
	// Constructor, que solamente fija el color de la carita
	public CaraS( Color _colorCara ) {
	setForeground( _colorCara );
	}
	public Dimension getPreferredSize() {
	return new Dimension( 250,250 );
	}
	// Este el el método de verdad que pinta, y lo hace cada vez que
	// el AWT le indica que lo haga
	public void paint( Graphics g ) {
	// Calculamos dinámicamente todos los tamaños, de forma que
	// el canvas se puede cambiar externamente
	// La circunferencia que forma la carita, siempre utiliza
	// como dimensión para el diámetro la dimensión más pequeña
	// de la ventana en que se encuentra
	Dimension tamano = getSize();
	// Calculamos el diámetro total de la carita
	int diam = Math.min( tamano.width,tamano.height );
	// Fijamos el diámetro de los ojos a un décimo del de la cara
	int diamOjo = diam/10;
	// Calculamos el centro
	int x = (tamano.width-diam) / 2;
	int y = (tamano.height-diam) / 2;
	// Pintamos la cara, a la cual ya le ha fijado el color el
	// constructor de la clase
	g.fillOval( x,y,diam,diam );
	g.setColor( Color.black);
	g.drawOval( x,y,diam,diam );
	// Pintamos los dos ojos de la carita
	g.fillOval( x+diam/3-(diamOjo/2),y+diam/3-(diamOjo/2),
	diamOjo,diamOjo );
	g.fillOval( x+(2*(diam/3))-(diamOjo/2),y+diam/3-(diamOjo/2),
	diamOjo,diamOjo );
	// Pintamos la boca de la carita
	//g.drawArc( x+diam/4,y+2*(diam/5),diam/2,diam/3,0,-180 );
	g.drawArc( x+diam/4,y+2*(diam/4),diam/2,diam/2,0,+180 );
	}
	} 
