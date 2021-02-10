
package com.demo;

import javafx.beans.property.ObjectProperty;
import javafx.event.EventHandler;

interface LongPressable {

  EventHandler<? super KeyButtonEvent> getOnLongPressed();

  void setOnLongPressed(EventHandler<? super KeyButtonEvent> eventhandler);

  ObjectProperty<EventHandler<? super KeyButtonEvent>> onLongPressedProperty();

  EventHandler<? super KeyButtonEvent> getOnShortPressed();

  void setOnShortPressed(EventHandler<? super KeyButtonEvent> eventhandler);

  ObjectProperty<EventHandler<? super KeyButtonEvent>> onShortPressedProperty();
}
