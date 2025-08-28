# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://../../LICENSE;md5=4ae09d45eac4aa08d013b5f2e01c67f6"

SRC_URI = "git://git@github.com/BrianDelalex/simple-ir-driver.git;protocol=ssh;branch=main"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "efaa6f59bb3fb95ff4d05b42f2c0db14db5667f2"

S = "${WORKDIR}/git/irdriver/test_application"

FILES:${PN} += "${bindir}/test_application"

do_configure () {
	:
}

do_compile () {
	oe_runmake
}

do_install () {
    # Installing module
    install -d ${D}/usr/bin
    install -m 0755 ${S}/test_application ${D}/usr/bin
}