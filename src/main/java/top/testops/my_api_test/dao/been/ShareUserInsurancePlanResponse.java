package top.testops.my_api_test.dao.been;

/**
  * @ClassName ShareUserInsurancePlanResponse
  * @Description TODO
  * @author carson
  * @date 2020/3/17
**/
public class ShareUserInsurancePlanResponse {

    /**
     * code : 200
     * message : 操作成功
     * data : {"url":"http://testh5.7tao.net/consultancy/#/?userId=ehe8THoiGK1MV3WsgREeJg%3D%3D&planId=BDF78EMSTjz7gMYDL22EfA%3D%3D&sign=c4e44a58200b05ac7ce9874a55eb1f72785ba1b90646934b","qrImg":"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAASwAAAEsAQAAAABRBrPYAAADbElEQVR42u2aTY7iQAyFjbLIkiPUTeBiSImUi4Wb1BGyzCKK573nYkR3z2I0q7IGpA5N8rGw/PfswvxvXpt9sA/2wf5DrJrZ4ONzM/PVfr+uXne+p8Dwt1Q/cX/0bXA+LPjPbL/H0/6x3a4LrXqUnTbb7XrYfnFcbjbkwRymPQo89ii4dRQYiUsqDEF3nc3ujssFfhqZKnmwiDelzNMXh5+WsP5PYdknxqyv+41B9+3yozh0iulV7Y6E9zXsO8xuNtWfJbpTrI5Pn4vuwz7EG4x0mDihhF3nkgFjpWJ64EJzm33PbfJXEegeq/sFDw3Ftowro4yJom+hpRyWAXMVqXEN7yDybmgk8hjq8VQzYOjf6Hv7fXsYLIVpZ+gQBF3Lm+4x10PkDS7UIeqARo+NKspJsKWOpz3YPlTCYB9LGO4NSbAToYaHiLKLCLhopDjEt46SAatS4jTXw0XPaB9ofidKcQbMW5rDXFaqookC1jdhngJTo4N3WHbZNE45C18Nj2XA4JYHyxW6HSRhzBZy4H57l1IdY1Wf0AGZ8Iy3lX46NbP6kQMj4eEY5sh4Ril2Yu+avGOstTx2O84WptGUHzUtpcCkPnY27LYlQOo7M4ibA8+A+WtLYEWCVvMQSvFskugZsEpNzpplHLGXUOe7euF74eocU7eDpfg0006UsFWbA1a0BJj2SyAQahIjO0uYeghFbsmAVblIMhY1a6aeGmrsLe8+58CcalDCA31viKXB+HKbpcB27jg0W2iPTI9RnR9RkVNgToJ6ipPRxHGVgpaT6mWzkgHjuwJMI93SfNcm7iMFVjUPwbS5hNuem9r59D2zusZgn3Jda+/X7gweu29mGTDXLY4VLi2L8IPNWqDZFx3SL1a1DIjJ6EYxouRZtabZ3gpXzxjVII8cJs5DD+aN/DS5enoGjLu9QTkSi8qRZxHshba3TWz/2GsyaiKcoRZCMBZPCTDpkBqLylC13GCeoQaHFFgIj3CWTlKiCJD4Mhl1jDWDtOpbY0ZqC5tvk1HHGE8VKcwXNRLXybTGbg6pngLb276eB6NbSMDS4u1dh/SO8UQoTti1BW/nQKd9bR9dY9TkbN32SngOfDxh9xSYTthNP2zgKGQhQdoiPwcWWc9KpSqs9Z8p4defxaFL7PMbsw/2wT7Yv2K/AMEvk+HnvSJ1AAAAAElFTkSuQmCC"}
     */

    private int code;
    private String message;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * url : http://testh5.7tao.net/consultancy/#/?userId=ehe8THoiGK1MV3WsgREeJg%3D%3D&planId=BDF78EMSTjz7gMYDL22EfA%3D%3D&sign=c4e44a58200b05ac7ce9874a55eb1f72785ba1b90646934b
         * qrImg : data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAASwAAAEsAQAAAABRBrPYAAADbElEQVR42u2aTY7iQAyFjbLIkiPUTeBiSImUi4Wb1BGyzCKK573nYkR3z2I0q7IGpA5N8rGw/PfswvxvXpt9sA/2wf5DrJrZ4ONzM/PVfr+uXne+p8Dwt1Q/cX/0bXA+LPjPbL/H0/6x3a4LrXqUnTbb7XrYfnFcbjbkwRymPQo89ii4dRQYiUsqDEF3nc3ujssFfhqZKnmwiDelzNMXh5+WsP5PYdknxqyv+41B9+3yozh0iulV7Y6E9zXsO8xuNtWfJbpTrI5Pn4vuwz7EG4x0mDihhF3nkgFjpWJ64EJzm33PbfJXEegeq/sFDw3Ftowro4yJom+hpRyWAXMVqXEN7yDybmgk8hjq8VQzYOjf6Hv7fXsYLIVpZ+gQBF3Lm+4x10PkDS7UIeqARo+NKspJsKWOpz3YPlTCYB9LGO4NSbAToYaHiLKLCLhopDjEt46SAatS4jTXw0XPaB9ofidKcQbMW5rDXFaqookC1jdhngJTo4N3WHbZNE45C18Nj2XA4JYHyxW6HSRhzBZy4H57l1IdY1Wf0AGZ8Iy3lX46NbP6kQMj4eEY5sh4Ril2Yu+avGOstTx2O84WptGUHzUtpcCkPnY27LYlQOo7M4ibA8+A+WtLYEWCVvMQSvFskugZsEpNzpplHLGXUOe7euF74eocU7eDpfg0006UsFWbA1a0BJj2SyAQahIjO0uYeghFbsmAVblIMhY1a6aeGmrsLe8+58CcalDCA31viKXB+HKbpcB27jg0W2iPTI9RnR9RkVNgToJ6ipPRxHGVgpaT6mWzkgHjuwJMI93SfNcm7iMFVjUPwbS5hNuem9r59D2zusZgn3Jda+/X7gweu29mGTDXLY4VLi2L8IPNWqDZFx3SL1a1DIjJ6EYxouRZtabZ3gpXzxjVII8cJs5DD+aN/DS5enoGjLu9QTkSi8qRZxHshba3TWz/2GsyaiKcoRZCMBZPCTDpkBqLylC13GCeoQaHFFgIj3CWTlKiCJD4Mhl1jDWDtOpbY0ZqC5tvk1HHGE8VKcwXNRLXybTGbg6pngLb276eB6NbSMDS4u1dh/SO8UQoTti1BW/nQKd9bR9dY9TkbN32SngOfDxh9xSYTthNP2zgKGQhQdoiPwcWWc9KpSqs9Z8p4defxaFL7PMbsw/2wT7Yv2K/AMEvk+HnvSJ1AAAAAElFTkSuQmCC
         */

        private String url;
        private String qrImg;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getQrImg() {
            return qrImg;
        }

        public void setQrImg(String qrImg) {
            this.qrImg = qrImg;
        }
    }
}
