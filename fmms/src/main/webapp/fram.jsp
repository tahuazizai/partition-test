<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.ztesoft.bss.common.config.SystemVar" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv=X-UA-Compatible content="IE=EmulateIE9">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>bss-web</title>
    <link href="image/favicon.ico" type="image/x-icon" rel="shortcut icon">
    <link rel="stylesheet" type="text/css" href="frm/fish-desktop/third-party/animatecss/animate.min.css">
    <link rel="stylesheet" type="text/css" href="LESS/dbmm-proj/fontAwesome/css/font-awesome.css">
    <link rel="stylesheet" type="text/css" href="frm/fish-desktop/css/fish-desktop-audit.css">
    <link rel="stylesheet" type="text/css" href="frm/fish-desktop/css/fish-ext-desktop-audit.css">
    <link rel="stylesheet" type="text/css" href="LESS/dbmm-proj/css/portal-desktop-audit.css">
    <link rel="stylesheet" type="text/css" href="frm/fish-desktop/third-party/fileupload/fileupload.css">
    <link rel="stylesheet" type="text/css" href="frm/fish-desktop/third-party/splitter/splitter.css">
    <link rel="stylesheet" type="text/css" href="template/default/portal/css/portal-bss-web.css">
    <link rel="stylesheet" type="text/css" href="audit/template/default/audit/css/dbmm-bss-web.css">
    <link rel="stylesheet" type="text/css" href="frm/fish-desktop/third-party/timeaxis/timeaxis.css">
   <%-- <link rel="stylesheet" href="bigScreen/styles/style.css">--%>
    <!--[if lt IE 9]>
    <script type="text/javascript" src="frm/fish-desktop/libs/bootstrap/html5shiv.js"></script>
    <script type="text/javascript" src="frm/fish-desktop/libs/bootstrap/respond.js"></script>
    <![endif]-->
    <script type="text/javascript" src="frm/fish-desktop/js/fish-desktop-all.js"></script>
    <script type="text/javascript" src="frm/fish-desktop/locale/fish-desktop-locale.zh.min.js"></script>
    <script type="text/javascript" src="frm/ext/console-fix.js"></script>
    <script type="text/javascript" src="frm/ext/bssslidingdoor.js"></script>
    <script type="text/javascript" src="frm/ext/tree-ext.js"></script>
    <script type="text/javascript" src="frm/ext/grid-ext.js"></script>
    <script type="text/javascript" src="frm/ext/label-ext.js"></script>
    <script type="text/javascript" src="frm/ext/fixedbox.js"></script>
    <script type="text/javascript" src="frm/ext/pagination-ext.js"></script>
    <script type="text/javascript" src="frm/ext/tooltip-ext.js"></script>
    <script type="text/javascript" src="frm/ext/popup-ext.js"></script>
    <script type="text/javascript" src="frm/ext/tab-ext.js"></script>
    <script type="text/javascript" src="frm/ext/combo-ext.js"></script>
    <script type="text/javascript" src="frm/ext/combotree-ext.js"></script>
    <script type="text/javascript" src="frm/ext/formlist.js"></script>
    <script type="text/javascript" src="frm/ext/hypermultiselect.js"></script>
    <script type="text/javascript" src="frm/ext/hypercombotree.js"></script>
    <script type="text/javascript" src="frm/ext/bsstimestep.js"></script>
    <script type="text/javascript" src="frm/ext/bssflowaxis.js"></script>
    <script type="text/javascript" src="frm/ext/bsshelper.js"></script>
    <script type="text/javascript" src="frm/ext/bssmenunav.js"></script>
    <script type="text/javascript" src="frm/ext/alert-ext.js"></script>
    <script type="text/javascript" src="frm/ext/combobox-ext.js"></script>
    <script type="text/javascript" src="frm/ext/bssipinput.js"></script>
    <script type="text/javascript" src="frm/ext/bsshelper.js"></script>
    <script type="text/javascript" src="modules/login/js/security.js"></script>
    <script type="text/javascript" src="frm/fish-desktop/third-party/splitter/fish.splitter.js"></script>
    <script type="text/javascript" src="frm/fish-desktop/third-party/timeaxis/fish.timeaxis.js"></script>
    <script type="text/javascript" src="frm/fish-desktop/third-party/jquery.nicescroll.min.js"></script>
    <!--[if gte IE 11]>
    <script type="text/javascript" src="frm/fish-desktop/third-party/pdf/build/pdf.js"></script>
    <![endif]-->
    <script type="text/javascript" src="frm/fish-desktop/third-party/pdf/pdfobject.js"></script>
    <script type="text/javascript" src="frm/fish-desktop/third-party/ieMap.js"></script>
    <script type="text/javascript" src="frm/ext/fish-bss-ext.js"></script>

    <script type="text/javascript" src="frm/fish-desktop/js/fish-desktop-require.min.js" data-main="fram"></script>

    <script>
      var url="${url}";
      //大屏页面特殊处理
      if(url=="bigScreen/modules/bigScreen/views/MainView"){
          location.href = "bigScreen/index.html";
      }
    </script>
</head>
<body>
<div id="fram"></div>
</body>
</html>
