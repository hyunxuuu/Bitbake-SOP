inherit binary

python do_init() {
    bb.plain("**************************")
    bb.plain("%s - %s" % (d.getVar('PN'), d.getVar('BB_CURRENTTASK')))
    bb.plain("**************************")
}

SRC_URI = "https://github.com/curl/curl/releases/download/curl-8_18_0/curl-8.18.0.tar.gz"

python do_build() {
    bb.plain("**************************")
    bb.plain("%s - %s" % (d.getVar('PN'), d.getVar('BB_CURRENTTASK')))
    bb.plain("**************************")
}