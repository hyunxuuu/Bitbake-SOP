do_print(){
	:
}

do_fetch[network] = "1"
python do_fetch() {
    src_uri = (d.getVar('SRC_URI') or "").split()
    if not src_uri:
        return
    try:
        fetcher = bb.fetch2.Fetch(src_uri, d)
        fetcher.download()
    except bb.fetch2.BBFetchException as e:
        bb.fatal("Bitbake Fetcher Error: " + repr(e))
}

do_unpack(){
	:
}

do_patch(){
	:
}

do_configure(){
	:
}

do_compile(){
	:
}

do_install(){
	:
}

do_package(){
	:
}

do_build(){
	:
}

addtask print
addtask fetch after do_print
addtask unpack after do_fetch
addtask patch after do_unpack
addtask configure after do_patch
addtask compile after do_configure
addtask install after do_compile
addtask package after do_install
addtask build after do_package