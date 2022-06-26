package models.managers.factory;
public class BrowserNotSupportedException extends IllegalStateException {

        public BrowserNotSupportedException(String browser) {
            super(String.format("Browser not supported: %s", browser));
        }
}
