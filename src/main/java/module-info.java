module ConferenceAppVirtualKeyboard {

  requires javafx.base;
  requires javafx.graphics;
  requires javafx.controls;
  requires org.slf4j;
  requires java.xml;
  requires java.desktop;

  exports com.demo.controls;

  opens com.demo to javafx.graphics;

}
