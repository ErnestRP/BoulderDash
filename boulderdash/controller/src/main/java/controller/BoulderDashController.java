package controller;

import java.io.IOException;
import IMobile ;

public class BoulderDashController {
	

	
	  

	    /** The view. */
	    private IBoulderDashView  view;

	    /** The model. */
	    private IBoulderDashModel model;

	    /** The stack order. */
	    private UserOrder            stackOrder;

	    /**
	     * Instantiates a new Boulderdash controller.
	     *
	     * @param view
	     *            the view
	     * @param model
	     *            the model
	     * @return 
	     */
	    public void BoulderDashController(final IBoulderDashView view, final IBoulderDashModel model) {
	        this.setView(view);
	        this.setModel(model);
	        this.clearStackOrder();
	    }

	  /**play
	   * 
	   * @throws InterruptedException
	   */
	    public final void play() throws InterruptedException {
	        while (this.getModel().getHeroe().isAlive()) {
	            Thread.sleep(speed);
	            switch (this.getStackOrder()) {
	                case RIGHT:
	                    this.getModel().getHeroe().moveRight();
	                    break;
	                case LEFT:
	                    this.getModel().getHeroe().moveLeft();
	                    break;
	                case NOP:
	                default:
	                    this.getModel().getHeroe().doNothing();
	                    break;
	            }
	            this.clearStackOrder();
	            if (this.getModel().getHeroe().isAlive()) {
	                this.getModel().getHeroe().moveDown();
	            }
	            this.getView().followHero();
	        }
	        this.getView().displayMessage("You're dead.");
	    }

	  
	    public final void orderPerform(final UserOrder userOrder) throws IOException {
	        this.setStackOrder(userOrder);
	    }

	    /**
	     * get the view
	     * 
	     *@param view
	     * 		get view
	     */
	    private IBoulderDashView getView() {
	        return this.view;
	    }

	    /**
	     * Sets the view.
	     *
	     * @param view
	     *            the view to set
	     */
	    private void setView(final IBoulderDashView view) {
	        this.view = view;
	    }

	    /**
	     * Gets the model.
	     *
	     * @return the model
	     */
	    private IBoulderDashModel getModel() {
	        return this.model;
	    }

	    /**
	     * Sets the model.
	     *
	     * @param model
	     *            the model to set
	     */
	    private void setModel(final IBoulderDashModel model) {
	        this.model = model;
	    }

	    /**
	     * Gets the stack order.
	     *
	     * @return the stack order
	     */
	    private UserOrder getStackOrder() {
	        return this.stackOrder;
	    }

	    /**
	     * Sets the stack order.
	     *
	     * @param stackOrder
	     *            the new stack order
	     */
	    private void setStackOrder(final UserOrder stackOrder) {
	        this.stackOrder = stackOrder;
	    }

	    /**
	     * Clear stack order.
	     */
	    private void clearStackOrder() {
	        this.stackOrder = UserOrder.STAY;
	    }

	   
	    public IOrderPerformer getOrderPeformer() {
	        return this;
	    }

	}


