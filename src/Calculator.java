import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Calculator extends Application{

	Label screen;
	Button button1;
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	Button button6;
	Button button7;
	Button button8;
	Button button9;
	Button button0;
	Button plus;
	Button minus;
	Button times;
	Button divide;
	Button clear;
	Button sign;
	Button enter;
	Button point;
	
	String curr;
	double first;
	double second;
	double answer;
	boolean pos;
	int operation; //1=+ 2=- 3=* 4=/
	boolean newOp;
	
	int i=1;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception{
		stage.setTitle("MyCalculator");
		//VBox root = new VBox();
		TilePane tilePane = new TilePane();
		tilePane.setHgap(20);
		tilePane.setVgap(10);
		//root.setSpacing(10);
		//root.setPadding(10);
		screen = new Label("");
		curr ="";
		pos = true;
		first=0;
		second=0;
		answer=0;
		operation=0;
		newOp=false;
		
		Scene scene = new Scene(tilePane, 200, 300);
		stage.setScene(scene);
		
		button1 = new Button("1");
		button2 = new Button("2");
		button3 = new Button("3");
		button4 = new Button("4");
		button5 = new Button("5");
		button6 = new Button("6");
		button7 = new Button("7");
		button8 = new Button("8");
		button9 = new Button("9");
		button0 = new Button("0");
		plus = new Button("+");
		minus = new Button("-");
		times  = new Button("*");
		divide = new Button("/");
		clear = new Button("AC");
		sign = new Button("+/-");
		enter = new Button("=");
		point = new Button(".");
		
		
		button1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.print("1");
				if(newOp) {
					screen.setText("");
					newOp=false;
				}
				screen.setText(screen.getText()+"1");
				curr=curr+"1";
			}
		});
		
		button2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.print("2");
				if(newOp) {
					screen.setText("");
					newOp=false;
				}
				screen.setText(screen.getText()+"2");
				curr=curr+"2";
			}
		});
		
		button3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.print("3");
				if(newOp) {
					screen.setText("");
					newOp=false;
				}
				screen.setText(screen.getText()+"3");
				curr=curr+"3";
			}
		});
		
		button4.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.print("4");
				if(newOp) {
					screen.setText("");
					newOp=false;
				}
				screen.setText(screen.getText()+"4");
				curr=curr+"4";
			}
		});
		
		button5.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.print("5");
				if(newOp) {
					screen.setText("");
					newOp=false;
				}
				screen.setText(screen.getText()+"5");
				curr=curr+"5";
			}
		});
		
		button6.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.print("6");
				if(newOp) {
					screen.setText("");
					newOp=false;
				}
				screen.setText(screen.getText()+"6");
				curr=curr+"6";
			}
		});
		
		button7.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.print("7");
				if(newOp) {
					screen.setText("");
					newOp=false;
				}
				screen.setText(screen.getText()+"7");
				curr=curr+"7";
			}
		});
		
		button8.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.print("8");
				if(newOp) {
					screen.setText("");
					newOp=false;
				}
				screen.setText(screen.getText()+"8");
				curr=curr+"8";
			}
		});
		
		button9.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.print("9");
				if(newOp) {
					screen.setText("");
					newOp=false;
				}
				screen.setText(screen.getText()+"9");
				curr=curr+"9";
			}
		});
		
		button0.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.print("0");
				if(newOp) {
					screen.setText("");
					newOp=false;
				}
				screen.setText(screen.getText()+"0");
				curr=curr+"0";
			}
		});
		
		plus.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.print("+");
				screen.setText(screen.getText()+"+");
				first = Double.parseDouble(curr);
				operation=1;
				curr="";
			}
		});
		
		minus.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.print("-");
				screen.setText(screen.getText()+"-");
				first = Double.parseDouble(curr);
				operation=2;
				curr="";
			}
		});
		
		times.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.print("*");
				screen.setText(screen.getText()+"*");
				first = Double.parseDouble(curr);
				operation=3;
				curr="";
			}
		});
		
		divide.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.print("/");
				screen.setText(screen.getText()+"/");
				first = Double.parseDouble(curr);
				operation=4;
				curr="";
			}
		});
		
		clear.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.print("\n");
				screen.setText("");
				curr="";
			}
		});
		
		sign.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.print("changesign");
				if(pos) {
					screen.setText("-"+screen.getText());
					pos=false;
				}
				else {
					screen.setText("+"+screen.getText());
					pos=true;
				}
				
			}
		});
		
		enter.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				
				second = Double.parseDouble(curr);
				if(!pos) {
					first=first*-1;
				}
				if(operation==1) {
					answer=first+second;
				}
				else if(operation==2) {
					answer=first-second;
				}
				else if(operation==3) {
					answer=first*second;
				}
				else if(operation==4) {
					answer=first/second;
				}
				System.out.print("="+answer+"\n");
				screen.setText(String.format("%.3f", answer));
				newOp=true;
				curr="";
				pos=true;
			}
		});
		
		point.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.print(".");
				screen.setText(screen.getText()+".");
				curr=curr+".";
			}
		});
		
		//root.getChildren().addAll(label1, button1, button2, button3, button4, button5, button6, button7, button8, button9, button0);
		tilePane.getChildren().add(clear);
		tilePane.getChildren().add(sign);
		tilePane.getChildren().add(point);
		tilePane.getChildren().add(button1);
        tilePane.getChildren().add(button2);
        tilePane.getChildren().add(button3);
        tilePane.getChildren().add(button4);
        tilePane.getChildren().add(button5);
        tilePane.getChildren().add(button6);
        tilePane.getChildren().add(button7);
        tilePane.getChildren().add(button8);
        tilePane.getChildren().add(button9);
        tilePane.getChildren().add(plus);
        tilePane.getChildren().add(button0);
        tilePane.getChildren().add(minus);
        tilePane.getChildren().add(times);
        tilePane.getChildren().add(divide);
        tilePane.getChildren().add(enter);
        tilePane.getChildren().add(screen);
		stage.show();
	}
}
