package org.starxg.janetfilter.plugin.fastrequest;

import com.janetfilter.core.plugin.MyTransformer;
import javassist.ClassPool;
import javassist.CtClass;

import java.io.ByteArrayInputStream;
import java.security.ProtectionDomain;

public class CrackTransformer implements MyTransformer {
    @Override
    public String getHookClassName() {
        return "io/github/kings1990/plugin/fastrequest/cofig/II1ll11IIlI1l11l";
    }

    @Override
    public byte[] transform(ClassLoader loader, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, String className, byte[] classBytes, int order) throws Exception {
        final ClassPool pool = ClassPool.getDefault();
        pool.appendSystemPath();
        final CtClass clazz = pool.makeClass(new ByteArrayInputStream(classBytes));
        clazz.getDeclaredMethod("IIl1lIl1111IlIlI1").insertBefore("return false");
        classBytes = clazz.toBytecode();
        clazz.detach();
        return classBytes;
    }
}
