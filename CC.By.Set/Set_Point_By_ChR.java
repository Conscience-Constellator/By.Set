package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Point_By_ChR;
import CC.Util.By.LMNt.Set_Point_By_Q;
import CC.Util.By.LMNt.Set_Q_By_ChR;
import CC.$.Q$Q.ChR$Point;
import CC.$.Q$Q.Point1$1;
import CC.$.Q2$.ChR_Point$;
import CC.$.Q_Q$Q.Point2$1;

public interface Set_Point_By_ChR<Valu_Typ,From_Typ> extends
	Get_Point_By_ChR<Valu_Typ>,
	Set_Q_By_ChR<From_Typ>,
	Set_Point_By_Q<Valu_Typ,From_Typ>,
	ChR_Point$<Valu_Typ>
{
	@Lin_Dclar
	void Set_Point_By_ChR(char By,Valu_Typ Valu);
		@Override @Neds_Ovrid(NEds=No)
		default void ChR_Point$(char By,Valu_Typ Valu)
		{Set_Point_By_ChR(By,Valu);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Point_By_ChR_Sorc(char By,ChR$Point<Valu_Typ> Sorc){Set_Point_By_ChR(By,Sorc.ChR$Point(By));}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Point1$1_By_ChR(char By,Point1$1<Valu_Typ,Valu_Typ> Fun,Valu_Typ Valu)
		{Set_Point_By_ChR(By,Fun.Point1$1(Valu));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Point1$1_By_ChR_Sorc(char By,Point1$1<Valu_Typ,Valu_Typ> Fun,ChR$Point<Valu_Typ> Sorc)
			{Set_Point1$1_By_ChR(By,Fun,Sorc.ChR$Point(By));}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Point1$1_By_ChR(char By,Point1$1<Valu_Typ,Valu_Typ> Fun)
				{Set_Point1$1_By_ChR_Sorc(By,Fun,this);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Point2$1_By_ChR(char By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Valu_Typ A,Valu_Typ B)
		{Set_Point_By_ChR(By,Fun.Point2$1(A,B));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Point2$1_By_ChR_SLit(char By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,ChR$Point<Valu_Typ> A,Valu_Typ B)
			{Set_Point2$1_By_ChR(By,Fun,A.ChR$Point(By),B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Point2$1_By_ChR(char By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Valu_Typ B)
				{Set_Point2$1_By_ChR_SLit(By,Fun,this,B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Set_Point2$1_By_ChR_Sorc(char By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,ChR$Point<Valu_Typ> A,ChR$Point<Valu_Typ> B)
				{Set_Point2$1_By_ChR_SLit(By,Fun,A,B.ChR$Point(By));}
					@Lin_Dclar @Neds_Ovrid(NEds=No)
					default void Mod_Point2$1_By_ChR_Sorc(char By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,ChR$Point<Valu_Typ> B)
					{Set_Point2$1_By_ChR_Sorc(By,Fun,this,B);}

	@Lin_Dclar @Neds_Ovrid(NEds=No)
	default Valu_Typ SGet_Point_By_ChR(char By,Valu_Typ Valu)
	{
		Valu_Typ Stor=Get_Point_By_ChR(By);
		Set_Point_By_ChR(By,Valu);

		return Stor;
	}
}