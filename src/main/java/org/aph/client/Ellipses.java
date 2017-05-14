package org.aph.client;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.canvas.dom.client.CssColor;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class Ellipses implements EntryPoint {
	private Canvas canvas;
	private Context2d context2d;

	@Override
	public void onModuleLoad() {

		Button button = new Button("Draw an ellipse!");
		RootPanel.get("button").add(button);

		canvas = Canvas.createIfSupported();
		context2d = canvas.getContext2d();
		RootPanel.get("canvas").add(canvas);

		button.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				drawEllipse();
			}
		});

	}

	private void drawEllipse() {
		int canvasWidth = canvas.getCoordinateSpaceWidth();
		int canvasHeight = canvas.getCoordinateSpaceHeight();

		// copied from
		// http://cs.smith.edu/dftwiki/index.php/Tutorial:_The_Basics_of_a_Simple_GWT_Canvas_App
		// TODO: draw ellipses instead of rectangles

		// Get random coordinates and sizing
		int rndX = Random.nextInt(canvasWidth);
		int rndY = Random.nextInt(canvasHeight);
		int rndWidth = Random.nextInt(canvasWidth);
		int rndHeight = Random.nextInt(canvasHeight);

		// Get a random color and alpha transparency
		int rndRedColor = Random.nextInt(255);
		int rndGreenColor = Random.nextInt(255);
		int rndBlueColor = Random.nextInt(255);
		double rndAlpha = Random.nextDouble();

		CssColor randomColor = CssColor
				.make("rgba(" + rndRedColor + ", " + rndGreenColor + "," + rndBlueColor + ", " + rndAlpha + ")");

		context2d.setFillStyle(randomColor);
		context2d.fillRect(rndX, rndY, rndWidth, rndHeight);
		context2d.fill();
	}

}