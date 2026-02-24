python do_print() {
    bb.plain("**************************")
    bb.plain("%s - %s" % (d.getVar('PN'), d.getVar('BB_CURRENTTASK')))
    bb.plain("**************************")
}

DEPENDS = "core"
DEPENDS += "curl zlib"
do_print[deptask] = "do_build"

SRC_URI = "https://ftp.gnu.org/gnu/hello/hello-2.12.tar.gz"

python do_build() {
    bb.plain("**************************")
    bb.plain("%s - %s" % (d.getVar('PN'), d.getVar('BB_CURRENTTASK')))
    bb.plain("**************************")
}