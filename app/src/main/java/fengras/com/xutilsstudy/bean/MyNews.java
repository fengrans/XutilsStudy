package fengras.com.xutilsstudy.bean;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

import java.util.List;

/**
 * Created by Administrator on 2017/4/21.
 */
public class MyNews {
    /**
     * code : 200
     * msg : success
     * data : [{"id":"121","goods_name":"镇店之宝丨美白嫩肤面膜7片","shop_price":49.9,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/121/goods_img/170301091610311632161123479.jpg","sales_volume":122793,"efficacy":"镇店之宝 美白爆款","sort":0},{"id":"389","goods_name":"超高回购率丨清爽平衡矿物黑面膜21片","shop_price":99.9,"market_price":297,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/389/goods_img/16081909368531961221339216.jpg","sales_volume":102394,"efficacy":"以黑吸黑 净透亮肤","sort":0},{"id":"85","goods_name":"果味鲜饮|水果鲜润亮肤补水面膜套装17片","shop_price":59.9,"market_price":240,"is_coupon_allowed":false,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/85/goods_img/160819085747012099748482408.jpg","sales_volume":93461,"efficacy":"水嫩舒爽 鲜活亮颜","sort":0},{"id":"684","goods_name":"解救肌渴丨花粹水润面膜套装10片","shop_price":29.9,"market_price":139,"is_coupon_allowed":false,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/684/goods_img/160819095063413908186337181.jpg","sales_volume":87621,"efficacy":"水润充盈 鲜嫩少女肌","sort":0},{"id":"343","goods_name":"美白嫩肤润肤水150ml","shop_price":59,"market_price":79,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/343/goods_img/161109195539019451480402371.jpg","sales_volume":56608,"efficacy":"补水保湿 美白嫩肤","sort":0},{"id":"5","goods_name":"黑眼圈不见啦丨金桂花矿物眼膜贴60片","shop_price":69,"market_price":89,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/5/goods_img/16081908444051052195086751.jpg","sales_volume":53676,"efficacy":"补水靓眼 改善熊猫眼","sort":0},{"id":"772","goods_name":"清爽亮颜黑面膜套装21片","shop_price":99.9,"market_price":297,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/772/goods_img/1608191429278479187604212.jpg","sales_volume":51776,"efficacy":"热销黑膜 净透亮肤","sort":0},{"id":"9","goods_name":"懒妹纸必备丨玫瑰滋养矿物睡眠面膜180g","shop_price":59.9,"market_price":79.9,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/9/goods_img/160819084569920890610621654.jpg","sales_volume":47055,"efficacy":"镇店之宝 彻夜补水","sort":0},{"id":"239","goods_name":"蜂蜜矿物蚕丝面膜7片","shop_price":89,"market_price":109,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/239/goods_img/16081909252442893599737067.jpg","sales_volume":43188,"efficacy":"深层补水 长效保湿","sort":0},{"id":"446","goods_name":"芦荟补水保湿凝胶150g","shop_price":49.9,"market_price":59,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/446/goods_img/16081909409518953549635059.jpg","sales_volume":38878,"efficacy":"水水润润 修护受损","sort":0},{"id":"8","goods_name":"镇店之宝|美白嫩肤面膜20片","shop_price":119.9,"market_price":298,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/8/goods_img/1703060954389257968293129.jpg","sales_volume":27847,"efficacy":"爆款面膜 明星同款","sort":0},{"id":"16","goods_name":"春季补水热荐丨玫瑰滋养保湿四件套（非礼盒）","shop_price":169.9,"market_price":259.9,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/16/goods_img/16081908495157874536435487.jpg","sales_volume":27689,"efficacy":"一整套源源补水","sort":0},{"id":"83","goods_name":"黑玫瑰矿物蚕丝面膜7片","shop_price":119,"market_price":139,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/83/goods_img/16081908576425344499831215.jpg","sales_volume":26522,"efficacy":"深度保养 补水提亮","sort":0},{"id":"95","goods_name":"多效套装丨补水滋养提亮修护多效蚕丝面膜28片","shop_price":139.9,"market_price":416,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/95/goods_img/160819085823018111120147866.jpg","sales_volume":26298,"efficacy":"补水滋养 提亮修护","sort":0},{"id":"428","goods_name":"多彩水润亮颜蚕丝面膜套装21片","shop_price":79.9,"market_price":270.9,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/428/goods_img/160819094034113421009937866.jpg","sales_volume":24290,"efficacy":"吸黑焕彩 补水保湿","sort":0},{"id":"559","goods_name":"热销泥浆丨竹炭净透矿物泥浆面膜110g","shop_price":59,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/559/goods_img/16081909445727749257882094.jpg","sales_volume":22267,"efficacy":"控油净肤 细腻毛孔","sort":0},{"id":"87","goods_name":"玫瑰滋养蚕丝面膜7片","shop_price":79,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/87/goods_img/16081908586078271308744782.jpg","sales_volume":21807,"efficacy":"密集滋养 补水保湿","sort":0},{"id":"257","goods_name":"薰衣草蚕丝面膜7片","shop_price":89,"market_price":109,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/257/goods_img/16081909269443843637779188.jpg","sales_volume":21359,"efficacy":"补水保湿 舒缓修护","sort":0},{"id":"101","goods_name":"玫瑰滋养矿物洁面乳100ml（满49包邮）","shop_price":26.9,"market_price":29.9,"is_coupon_allowed":false,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/101/goods_img/160819085919220738763253204.jpg","sales_volume":19010,"efficacy":"温和清洁 补水保湿","sort":0},{"id":"593","goods_name":"热销黑膜丨葡萄籽琉璃亮颜黑面膜21片","shop_price":99.9,"market_price":297,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/593/goods_img/1608190945359698973439364.jpg","sales_volume":18413,"efficacy":"葡萄鲜饮 净透亮肤","sort":0},{"id":"315","goods_name":"玫瑰滋养矿物润肤水","shop_price":65,"market_price":69,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/315/goods_img/160819092638220971403079814.jpg","sales_volume":17791,"efficacy":"持久保湿 静享芬芳","sort":0},{"id":"379","goods_name":"净透美白矿物蚕丝面膜黑面膜14片","shop_price":69.9,"market_price":198,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/379/goods_img/160819093561210755335724384.jpg","sales_volume":17426,"efficacy":"清洁净透 以白养白","sort":0},{"id":"336","goods_name":"玫瑰滋养矿物润肤乳液","shop_price":69,"market_price":89,"is_coupon_allowed":false,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/336/goods_img/160819092836113507603804875.jpg","sales_volume":16148,"efficacy":"长效保湿 持久滋养","sort":0},{"id":"20","goods_name":"清润紧致蚕丝面膜套装21片","shop_price":109.9,"market_price":307,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/20/goods_img/160819084923710469247382812.jpg","sales_volume":15575,"efficacy":"清透滋养 弹嫩紧致","sort":0},{"id":"313","goods_name":"清爽平衡矿物爽肤水150ml","shop_price":65,"market_price":69,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/313/goods_img/160819092628116143728778105.jpg","sales_volume":13926,"efficacy":"补水控油 收敛毛孔","sort":0},{"id":"400","goods_name":"缤纷鲜润矿物蚕丝面膜套装20片","shop_price":79.9,"market_price":279.9,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/400/goods_img/16081909375548938767322654.jpg","sales_volume":13464,"efficacy":"补水亮肤 缤纷水嫩","sort":0},{"id":"646","goods_name":"黑茶水滢净润黑面膜7片","shop_price":79,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/646/goods_img/160819142886610735083339639.jpg","sales_volume":13154,"efficacy":"深层精华 改善暗沉","sort":0},{"id":"58","goods_name":"矿物养肤霜(滋润型)50g","shop_price":79,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/58/goods_img/160819085056119208440462735.jpg","sales_volume":12747,"efficacy":"滋润补水 持久水润","sort":0},{"id":"17","goods_name":"礼盒装丨男士黑茶控油护肤三件套","shop_price":99.9,"market_price":199.9,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/17/goods_img/16081908499853298911775471.jpg","sales_volume":12207,"efficacy":"清洁控油 神清气爽","sort":0},{"id":"745","goods_name":"红石榴矿物蚕丝面膜7片","shop_price":79,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"http://image.hmeili.com/yunifang/images/goods/745/goods_img/160819095890910677609745693.jpg","sales_volume":11609,"efficacy":"补水保湿 提亮肤色","sort":0}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }
    @Table(name="databean")
    public static class DataBean {
        /**
         * id : 121
         * goods_name : 镇店之宝丨美白嫩肤面膜7片
         * shop_price : 49.9
         * market_price : 99.0
         * is_coupon_allowed : true
         * is_allow_credit : false
         * goods_img : https://image.yunifang.com/yunifang/images/goods/121/goods_img/170301091610311632161123479.jpg
         * sales_volume : 122793
         * efficacy : 镇店之宝 美白爆款
         * sort : 0
         */
        @Column(name = "id",isId = true,autoGen = true,property = "NOT NULL")
        private String id;
        private String goods_name;
        private double shop_price;
        private double market_price;
        private boolean is_coupon_allowed;
        private boolean is_allow_credit;
        private String goods_img;
        private int sales_volume;
        private String efficacy;
        private int sort;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public DataBean() {
        }

        public String getGoods_name() {
            return goods_name;
        }

        public void setGoods_name(String goods_name) {
            this.goods_name = goods_name;
        }

        public double getShop_price() {
            return shop_price;
        }

        public void setShop_price(double shop_price) {
            this.shop_price = shop_price;
        }

        public double getMarket_price() {
            return market_price;
        }

        public void setMarket_price(double market_price) {
            this.market_price = market_price;
        }

        public boolean isIs_coupon_allowed() {
            return is_coupon_allowed;
        }

        public void setIs_coupon_allowed(boolean is_coupon_allowed) {
            this.is_coupon_allowed = is_coupon_allowed;
        }

        public boolean isIs_allow_credit() {
            return is_allow_credit;
        }

        public void setIs_allow_credit(boolean is_allow_credit) {
            this.is_allow_credit = is_allow_credit;
        }

        public String getGoods_img() {
            return goods_img;
        }

        public void setGoods_img(String goods_img) {
            this.goods_img = goods_img;
        }

        public int getSales_volume() {
            return sales_volume;
        }

        public void setSales_volume(int sales_volume) {
            this.sales_volume = sales_volume;
        }

        public String getEfficacy() {
            return efficacy;
        }

        public void setEfficacy(String efficacy) {
            this.efficacy = efficacy;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }
    }
}
