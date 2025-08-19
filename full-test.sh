#!/bin/bash
source poky/oe-init-build-env

CONFLINE="MACHINE = \"raspberrypi4\""

IMAGE="IMAGE_FSTYPES = \"wic.bz2\""

FS_PATH=$(bitbake-getvar --value -r core-image-finalproject IMAGE_ROOTFS)
find "${FS_PATH}/lib/modules/" -name "irdriver.ko" | grep .
if [ $? -ne 0 ]; then
    exit 1
fi
exit 0