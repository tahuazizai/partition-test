require.config({
    // Libraries
    paths: {
        knockout:"frm/fish-desktop/third-party/knockout/knockout.debug",
        knockout_mapping:"frm/fish-desktop/third-party/knockout/knockout.mapping.debug"
    }
});

$.support.cors = true;//支持跨域
fish.View.configure({manage: true, syncRender:true}); //全局设置fish使用扩展的功能
fish.setLanguage('zh'); //设置国际化语音
require([url,"knockout", "knockout_mapping",'frm/portal/portal'],
    function(IndexView, ko, mapping,__){

        ko.mapping = mapping;
        fish.ko = ko;
        window.ko = ko;


        new IndexView({
            el : $('#fram') //主视图选择器
        }).render();

    })