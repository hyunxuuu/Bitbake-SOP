python do_init() {
    bb.plain("**************************")
    bb.plain("%s - %s" % (d.getVar('PN'), d.getVar('BB_CURRENTTASK')))
    bb.plain("**************************")
}

SRC_URI = "https://ftp.gnu.org/gnu/hello/hello-2.12.tar.gz"

python do_compile() {
    bb.plain("**************************")
    bb.plain("%s - %s" % (d.getVar('PN'), d.getVar('BB_CURRENTTASK')))
    bb.plain("**************************")
}

DEPENDS = "core"
DEPENDS += "curl zlib"
do_compile[deptask] = "do_build"

python do_build() {
    bb.plain("**************************")
    bb.plain("%s - %s" % (d.getVar('PN'), d.getVar('BB_CURRENTTASK')))
    bb.plain("**************************")
}