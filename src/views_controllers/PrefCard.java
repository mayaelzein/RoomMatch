package views_controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.util.StringConverter;

public class PrefCard {
	
	@FXML 
	private Label prefLabel;
	@FXML
	private ComboBox<String> options;
	@FXML 
	private CheckBox dealBreaker;
	
	public void createPrefCard(String pLabel, String[] list) {
		prefLabel.setText(pLabel);
		options.setItems(FXCollections.observableArrayList(list));

		options.setConverter(new StringConverter<String>() {
			@Override
			public String toString(String value) {
				if (value == null) {
					return "";
				}

				if (value.equals("non-disclosed")) {
					return "Prefer not to say";
				}

				if (value.equals("rare")) {
					return "Rarely";
				}

				String formatted = value.replace('_', ' ');

				String[] words = formatted.split(" ");
				StringBuilder result = new StringBuilder();

				for (String word : words) {
					if (!word.isEmpty()) {
						if (result.length() > 0) {
							result.append(" ");
						}

						result.append(
							Character.toUpperCase(word.charAt(0))
							+ word.substring(1)
						);
					}
				}

				return result.toString();
			}

			@Override
			public String fromString(String value) {
				if (value == null) {
					return null;
				}

				for (String option : list) {
					if (toString(option).equals(value)) {
						return option;
					}
				}

				return value;
			}
		});
	}
	
	public void setValues(String userPref, boolean userBreaker) {
		options.setValue(userPref);
		dealBreaker.setSelected(userBreaker);
		
	}
	public String getPrefOption() {
		return options.getValue();
	}
	
	public boolean getDealBreakerValue() {
		return this.dealBreaker.isSelected();
	}
	
}
