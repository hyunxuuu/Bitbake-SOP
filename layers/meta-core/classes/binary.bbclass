deltask init
deltask fetch
deltask unpack
deltask patch
deltask configure
deltask compile
deltask install
deltask package
deltask build

do_init(){
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

do_build(){
	:
}

addtask init
addtask fetch after do_init
addtask unpack after do_fetch
addtask build after do_unpack