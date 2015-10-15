function _change() {
	$("#vCode").attr("src", "/we-lab-site/VerifyCodeServlet?" + new Date().getTime());
}