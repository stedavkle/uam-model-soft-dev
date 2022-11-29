		package wizard;

		import java.awt.BorderLayout;
		import java.awt.CardLayout;
		import java.awt.GridLayout;
		
		import javax.swing.*;
		import listeners.*;
		
		public class Wizard extends JFrame {
			final static String PAGE1 = "Page1";
			final static String PAGE2 = "Page2";
			final static String PAGE3 = "Page3";
			final static String PAGE4 = "Page4";
	
			public Wizard () {
				super ("New Project");
				
				JPanel wizard, page, fields, buttons;
				JButton button;
				JLabel  label;
				JTextField text;
				JCheckBox check;

				// panel containing all pages
					wizard = new JPanel(new CardLayout());
				
					// Page1 of wizard

					// - fields
					fields  = new JPanel(new GridLayout(0, 2));

						label   = new JLabel("Name:");
						fields.add(label);
						text    = new JTextField(10);
						fields.add(text);
					
					// checkboxes

					// - buttons
					buttons = new JPanel();
					
						button  = new JButton("");
								button.addActionListener(new ChangePageListener(wizard, PAGE2));
						buttons.add(button);
						button  = new JButton("Cancel");
							button.addActionListener(new CloseWizardListener(this));
						buttons.add(button);

					// - adding page to wizard
					page    = new JPanel(new BorderLayout());
					page.add(fields,   BorderLayout.CENTER);
					page.add(buttons, BorderLayout.SOUTH);
					wizard.add(page, PAGE1);
					
					// Page2 of wizard

					// - fields
					fields  = new JPanel(new GridLayout(0, 2));

					
					// checkboxes
						label   = new JLabel("create src folder");
						fields.add(label);
						check   = new JCheckBox();
						check.setSelected(true); // to select the checkbox

					// - buttons
					buttons = new JPanel();
					
						button  = new JButton("Cancel");
							button.addActionListener(new CloseWizardListener(this));
						buttons.add(button);
						button  = new JButton("Next");
								button.addActionListener(new ChangePageListener(wizard, PAGE3));
						buttons.add(button);
						button  = new JButton("Back");
							button.addActionListener(new ChangePageListener(wizard, PAGE1));
						buttons.add(button);

					// - adding page to wizard
					page    = new JPanel(new BorderLayout());
					page.add(fields,   BorderLayout.CENTER);
					page.add(buttons, BorderLayout.SOUTH);
					wizard.add(page, PAGE2);
					
					// Page3 of wizard

					// - fields
					fields  = new JPanel(new GridLayout(0, 2));

						label   = new JLabel("Folder:");
						fields.add(label);
						text    = new JTextField(10);
						fields.add(text);
					
					// checkboxes

					// - buttons
					buttons = new JPanel();
					
						button  = new JButton("Finish");
							button.addActionListener(new CloseWizardListener(this));
						buttons.add(button);
						button  = new JButton("Back");
							button.addActionListener(new ChangePageListener(wizard, PAGE2));
						buttons.add(button);

					// - adding page to wizard
					page    = new JPanel(new BorderLayout());
					page.add(fields,   BorderLayout.CENTER);
					page.add(buttons, BorderLayout.SOUTH);
					wizard.add(page, PAGE3);
					
					// Page4 of wizard

					// - fields
					fields  = new JPanel(new GridLayout(0, 2));

					
					// checkboxes

					// - buttons
					buttons = new JPanel();
					
						button  = new JButton("Finish");
							button.addActionListener(new CloseWizardListener(this));
						buttons.add(button);
						button  = new JButton("Back");
							button.addActionListener(new ChangePageListener(wizard, PAGE2));
						buttons.add(button);

					// - adding page to wizard
					page    = new JPanel(new BorderLayout());
					page.add(fields,   BorderLayout.CENTER);
					page.add(buttons, BorderLayout.SOUTH);
					wizard.add(page, PAGE4);
					

			/**
			 * show wizard
			 */
			public void showWizard() {
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.pack();
				this.setVisible(true);
			}
		}
