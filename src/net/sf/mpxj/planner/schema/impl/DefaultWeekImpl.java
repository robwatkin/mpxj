//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.3-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.02.21 at 11:46:13 GMT 
//


package net.sf.mpxj.planner.schema.impl;

public class DefaultWeekImpl implements net.sf.mpxj.planner.schema.DefaultWeek, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sf.mpxj.planner.schema.impl.runtime.UnmarshallableObject, net.sf.mpxj.planner.schema.impl.runtime.XMLSerializable, net.sf.mpxj.planner.schema.impl.runtime.ValidatableObject
{

    protected java.lang.String _Mon;
    protected java.lang.String _Sun;
    protected java.lang.String _Tue;
    protected java.lang.String _Sat;
    protected java.lang.String _Thu;
    protected java.lang.String _Fri;
    protected java.lang.String _Wed;
    public final static java.lang.Class version = (net.sf.mpxj.planner.schema.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sf.mpxj.planner.schema.DefaultWeek.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "default-week";
    }

    public java.lang.String getMon() {
        return _Mon;
    }

    public void setMon(java.lang.String value) {
        _Mon = value;
    }

    public java.lang.String getSun() {
        return _Sun;
    }

    public void setSun(java.lang.String value) {
        _Sun = value;
    }

    public java.lang.String getTue() {
        return _Tue;
    }

    public void setTue(java.lang.String value) {
        _Tue = value;
    }

    public java.lang.String getSat() {
        return _Sat;
    }

    public void setSat(java.lang.String value) {
        _Sat = value;
    }

    public java.lang.String getThu() {
        return _Thu;
    }

    public void setThu(java.lang.String value) {
        _Thu = value;
    }

    public java.lang.String getFri() {
        return _Fri;
    }

    public void setFri(java.lang.String value) {
        _Fri = value;
    }

    public java.lang.String getWed() {
        return _Wed;
    }

    public void setWed(java.lang.String value) {
        _Wed = value;
    }

    public net.sf.mpxj.planner.schema.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sf.mpxj.planner.schema.impl.runtime.UnmarshallingContext context) {
        return new net.sf.mpxj.planner.schema.impl.DefaultWeekImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sf.mpxj.planner.schema.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("", "default-week");
        context.endNamespaceDecls();
        if (_Wed!= null) {
            context.startAttribute("", "wed");
            try {
                context.text(((java.lang.String) _Wed), "Wed");
            } catch (java.lang.Exception e) {
                net.sf.mpxj.planner.schema.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Sat!= null) {
            context.startAttribute("", "sat");
            try {
                context.text(((java.lang.String) _Sat), "Sat");
            } catch (java.lang.Exception e) {
                net.sf.mpxj.planner.schema.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Fri!= null) {
            context.startAttribute("", "fri");
            try {
                context.text(((java.lang.String) _Fri), "Fri");
            } catch (java.lang.Exception e) {
                net.sf.mpxj.planner.schema.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Sun!= null) {
            context.startAttribute("", "sun");
            try {
                context.text(((java.lang.String) _Sun), "Sun");
            } catch (java.lang.Exception e) {
                net.sf.mpxj.planner.schema.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Thu!= null) {
            context.startAttribute("", "thu");
            try {
                context.text(((java.lang.String) _Thu), "Thu");
            } catch (java.lang.Exception e) {
                net.sf.mpxj.planner.schema.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Tue!= null) {
            context.startAttribute("", "tue");
            try {
                context.text(((java.lang.String) _Tue), "Tue");
            } catch (java.lang.Exception e) {
                net.sf.mpxj.planner.schema.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Mon!= null) {
            context.startAttribute("", "mon");
            try {
                context.text(((java.lang.String) _Mon), "Mon");
            } catch (java.lang.Exception e) {
                net.sf.mpxj.planner.schema.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        context.endAttributes();
        context.endElement();
    }

    public void serializeAttributes(net.sf.mpxj.planner.schema.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(net.sf.mpxj.planner.schema.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sf.mpxj.planner.schema.DefaultWeek.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004sr\u0000\u0011java.lang.Boolean\u00cd r"
+"\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004na"
+"met\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004ppsr\u0000-com.sun.msv.da"
+"tatype.xsd.NormalizedStringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.da"
+"tatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun."
+"msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv"
+".datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatyp"
+"e.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/"
+"String;L\u0000\btypeNameq\u0000~\u0000\u001eL\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype"
+"/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSche"
+"mat\u0000\u0010normalizedStringsr\u00004com.sun.msv.datatype.xsd.WhiteSpace"
+"Processor$Replace\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.Whi"
+"teSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.grammar.Expres"
+"sion$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004ppsr\u0000\u001bcom.sun.msv.uti"
+"l.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001eL\u0000\fnamespaceURIq\u0000~\u0000\u001e"
+"xpt\u0000\u0005CDATAt\u0000\u0000sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001eL\u0000\fnamespaceURIq\u0000~\u0000\u001exr\u0000\u001dcom.sun.msv.gram"
+"mar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0003wedq\u0000~\u0000+sr\u00000com.sun.msv.grammar"
+".Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0013\u0001q\u0000~\u00001sq"
+"\u0000~\u0000\u000fppsq\u0000~\u0000\u0011q\u0000~\u0000\u0014pq\u0000~\u0000\u0018sq\u0000~\u0000,t\u0000\u0003satq\u0000~\u0000+q\u0000~\u00001sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0011q"
+"\u0000~\u0000\u0014pq\u0000~\u0000\u0018sq\u0000~\u0000,t\u0000\u0003friq\u0000~\u0000+q\u0000~\u00001sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0011q\u0000~\u0000\u0014pq\u0000~\u0000\u0018sq\u0000"
+"~\u0000,t\u0000\u0003sunq\u0000~\u0000+q\u0000~\u00001sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0011q\u0000~\u0000\u0014pq\u0000~\u0000\u0018sq\u0000~\u0000,t\u0000\u0003thuq\u0000~\u0000"
+"+q\u0000~\u00001sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0011q\u0000~\u0000\u0014pq\u0000~\u0000\u0018sq\u0000~\u0000,t\u0000\u0003tueq\u0000~\u0000+q\u0000~\u00001sq\u0000~\u0000\u000fp"
+"psq\u0000~\u0000\u0011q\u0000~\u0000\u0014pq\u0000~\u0000\u0018sq\u0000~\u0000,t\u0000\u0003monq\u0000~\u0000+q\u0000~\u00001sq\u0000~\u0000,t\u0000\fdefault-wee"
+"kq\u0000~\u0000+sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bex"
+"pTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr"
+"\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000"
+"\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/Expre"
+"ssionPool;xp\u0000\u0000\u0000\r\u0001pq\u0000~\u0000;q\u0000~\u00007q\u0000~\u0000\u000eq\u0000~\u0000\rq\u0000~\u0000?q\u0000~\u0000\nq\u0000~\u0000Gq\u0000~\u0000\u000bq\u0000"
+"~\u00003q\u0000~\u0000\fq\u0000~\u0000Cq\u0000~\u0000\u0010q\u0000~\u0000\tx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sf.mpxj.planner.schema.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sf.mpxj.planner.schema.impl.runtime.UnmarshallingContext context) {
            super(context, "------------------------");
        }

        protected Unmarshaller(net.sf.mpxj.planner.schema.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sf.mpxj.planner.schema.impl.DefaultWeekImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  23 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "wed");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 4;
                            continue outer;
                        }
                        state = 4;
                        continue outer;
                    case  19 :
                        attIdx = context.getAttribute("", "mon");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 22;
                            continue outer;
                        }
                        state = 22;
                        continue outer;
                    case  7 :
                        attIdx = context.getAttribute("", "fri");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 10;
                            continue outer;
                        }
                        state = 10;
                        continue outer;
                    case  0 :
                        if (("default-week" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  13 :
                        attIdx = context.getAttribute("", "thu");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText4(v);
                            state = 16;
                            continue outer;
                        }
                        state = 16;
                        continue outer;
                    case  4 :
                        attIdx = context.getAttribute("", "sat");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText5(v);
                            state = 7;
                            continue outer;
                        }
                        state = 7;
                        continue outer;
                    case  10 :
                        attIdx = context.getAttribute("", "sun");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText6(v);
                            state = 13;
                            continue outer;
                        }
                        state = 13;
                        continue outer;
                    case  16 :
                        attIdx = context.getAttribute("", "tue");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText7(v);
                            state = 19;
                            continue outer;
                        }
                        state = 19;
                        continue outer;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Wed = com.sun.xml.bind.WhiteSpaceProcessor.replace(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Mon = com.sun.xml.bind.WhiteSpaceProcessor.replace(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Fri = com.sun.xml.bind.WhiteSpaceProcessor.replace(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText4(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Thu = com.sun.xml.bind.WhiteSpaceProcessor.replace(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText5(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Sat = com.sun.xml.bind.WhiteSpaceProcessor.replace(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText6(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Sun = com.sun.xml.bind.WhiteSpaceProcessor.replace(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText7(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Tue = com.sun.xml.bind.WhiteSpaceProcessor.replace(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  23 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "wed");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 4;
                            continue outer;
                        }
                        state = 4;
                        continue outer;
                    case  19 :
                        attIdx = context.getAttribute("", "mon");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 22;
                            continue outer;
                        }
                        state = 22;
                        continue outer;
                    case  7 :
                        attIdx = context.getAttribute("", "fri");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 10;
                            continue outer;
                        }
                        state = 10;
                        continue outer;
                    case  22 :
                        if (("default-week" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 23;
                            return ;
                        }
                        break;
                    case  13 :
                        attIdx = context.getAttribute("", "thu");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText4(v);
                            state = 16;
                            continue outer;
                        }
                        state = 16;
                        continue outer;
                    case  4 :
                        attIdx = context.getAttribute("", "sat");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText5(v);
                            state = 7;
                            continue outer;
                        }
                        state = 7;
                        continue outer;
                    case  10 :
                        attIdx = context.getAttribute("", "sun");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText6(v);
                            state = 13;
                            continue outer;
                        }
                        state = 13;
                        continue outer;
                    case  16 :
                        attIdx = context.getAttribute("", "tue");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText7(v);
                            state = 19;
                            continue outer;
                        }
                        state = 19;
                        continue outer;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  23 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("wed" == ___local)&&("" == ___uri)) {
                            state = 2;
                            return ;
                        }
                        state = 4;
                        continue outer;
                    case  19 :
                        if (("mon" == ___local)&&("" == ___uri)) {
                            state = 20;
                            return ;
                        }
                        state = 22;
                        continue outer;
                    case  7 :
                        if (("fri" == ___local)&&("" == ___uri)) {
                            state = 8;
                            return ;
                        }
                        state = 10;
                        continue outer;
                    case  13 :
                        if (("thu" == ___local)&&("" == ___uri)) {
                            state = 14;
                            return ;
                        }
                        state = 16;
                        continue outer;
                    case  4 :
                        if (("sat" == ___local)&&("" == ___uri)) {
                            state = 5;
                            return ;
                        }
                        state = 7;
                        continue outer;
                    case  10 :
                        if (("sun" == ___local)&&("" == ___uri)) {
                            state = 11;
                            return ;
                        }
                        state = 13;
                        continue outer;
                    case  16 :
                        if (("tue" == ___local)&&("" == ___uri)) {
                            state = 17;
                            return ;
                        }
                        state = 19;
                        continue outer;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        if (("sat" == ___local)&&("" == ___uri)) {
                            state = 7;
                            return ;
                        }
                        break;
                    case  15 :
                        if (("thu" == ___local)&&("" == ___uri)) {
                            state = 16;
                            return ;
                        }
                        break;
                    case  18 :
                        if (("tue" == ___local)&&("" == ___uri)) {
                            state = 19;
                            return ;
                        }
                        break;
                    case  12 :
                        if (("sun" == ___local)&&("" == ___uri)) {
                            state = 13;
                            return ;
                        }
                        break;
                    case  23 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "wed");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 4;
                            continue outer;
                        }
                        state = 4;
                        continue outer;
                    case  19 :
                        attIdx = context.getAttribute("", "mon");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 22;
                            continue outer;
                        }
                        state = 22;
                        continue outer;
                    case  7 :
                        attIdx = context.getAttribute("", "fri");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 10;
                            continue outer;
                        }
                        state = 10;
                        continue outer;
                    case  21 :
                        if (("mon" == ___local)&&("" == ___uri)) {
                            state = 22;
                            return ;
                        }
                        break;
                    case  3 :
                        if (("wed" == ___local)&&("" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        break;
                    case  13 :
                        attIdx = context.getAttribute("", "thu");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText4(v);
                            state = 16;
                            continue outer;
                        }
                        state = 16;
                        continue outer;
                    case  9 :
                        if (("fri" == ___local)&&("" == ___uri)) {
                            state = 10;
                            return ;
                        }
                        break;
                    case  4 :
                        attIdx = context.getAttribute("", "sat");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText5(v);
                            state = 7;
                            continue outer;
                        }
                        state = 7;
                        continue outer;
                    case  10 :
                        attIdx = context.getAttribute("", "sun");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText6(v);
                            state = 13;
                            continue outer;
                        }
                        state = 13;
                        continue outer;
                    case  16 :
                        attIdx = context.getAttribute("", "tue");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText7(v);
                            state = 19;
                            continue outer;
                        }
                        state = 19;
                        continue outer;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  14 :
                            eatText4(value);
                            state = 15;
                            return ;
                        case  23 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "wed");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 4;
                                continue outer;
                            }
                            state = 4;
                            continue outer;
                        case  2 :
                            eatText1(value);
                            state = 3;
                            return ;
                        case  5 :
                            eatText5(value);
                            state = 6;
                            return ;
                        case  20 :
                            eatText2(value);
                            state = 21;
                            return ;
                        case  19 :
                            attIdx = context.getAttribute("", "mon");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText2(v);
                                state = 22;
                                continue outer;
                            }
                            state = 22;
                            continue outer;
                        case  7 :
                            attIdx = context.getAttribute("", "fri");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText3(v);
                                state = 10;
                                continue outer;
                            }
                            state = 10;
                            continue outer;
                        case  8 :
                            eatText3(value);
                            state = 9;
                            return ;
                        case  11 :
                            eatText6(value);
                            state = 12;
                            return ;
                        case  17 :
                            eatText7(value);
                            state = 18;
                            return ;
                        case  13 :
                            attIdx = context.getAttribute("", "thu");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText4(v);
                                state = 16;
                                continue outer;
                            }
                            state = 16;
                            continue outer;
                        case  4 :
                            attIdx = context.getAttribute("", "sat");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText5(v);
                                state = 7;
                                continue outer;
                            }
                            state = 7;
                            continue outer;
                        case  10 :
                            attIdx = context.getAttribute("", "sun");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText6(v);
                                state = 13;
                                continue outer;
                            }
                            state = 13;
                            continue outer;
                        case  16 :
                            attIdx = context.getAttribute("", "tue");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText7(v);
                                state = 19;
                                continue outer;
                            }
                            state = 19;
                            continue outer;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}