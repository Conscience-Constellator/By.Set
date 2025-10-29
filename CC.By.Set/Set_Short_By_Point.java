package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Short_By_Point;
import CC.Util.By.LMNt.Set_Q_By_Point;
import CC.Util.By.LMNt.Set_Short_By_Q;
import CC.$.Q$Q.Point$Short;
import CC.$.Q$Q.Short1$1;
import CC.$.Q2$.Point_Short$;
import CC.$.Q2$1.Short2$1;

public interface Set_Short_By_Point<By_Typ,From_Typ> extends
	Get_Short_By_Point<By_Typ>,
	Set_Q_By_Point<By_Typ,From_Typ>,
	Set_Short_By_Q<From_Typ>,
	Point_Short$<By_Typ>
{
	@Lin_Dclar
	void Set_Short_By_Point(By_Typ By,short Valu);
		@Override @Neds_Ovrid(NEds=No)
		default void Point_Short$(By_Typ By,short Valu)
		{Set_Short_By_Point(By,Valu);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Short_By_Point_Sorc(By_Typ By,Point$Short<By_Typ> Sorc){Set_Short_By_Point(By,Sorc.Point$Short(By));}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Short1$1_By_Point(By_Typ By,Short1$1 Fun,short Valu)
		{Set_Short_By_Point(By,Fun.Short1$1(Valu));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Short1$1_By_Point_Sorc(By_Typ By,Short1$1 Fun,Point$Short<By_Typ> Sorc)
			{Set_Short1$1_By_Point(By,Fun,Sorc.Point$Short(By));}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Short1$1_By_Point(By_Typ By,Short1$1 Fun)
				{Set_Short1$1_By_Point_Sorc(By,Fun,this);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Short2$1_By_Point(By_Typ By,Short2$1 Fun,short A,short B)
		{Set_Short_By_Point(By,Fun.Short2$1(A,B));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Short2$1_By_Point_SLit(By_Typ By,Short2$1 Fun,Point$Short<By_Typ> A,short B)
			{Set_Short2$1_By_Point(By,Fun,A.Point$Short(By),B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Short2$1_By_Point(By_Typ By,Short2$1 Fun,short B)
				{Set_Short2$1_By_Point_SLit(By,Fun,this,B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Set_Short2$1_By_Point_Sorc(By_Typ By,Short2$1 Fun,Point$Short<By_Typ> A,Point$Short<By_Typ> B)
				{Set_Short2$1_By_Point_SLit(By,Fun,A,B.Point$Short(By));}
					@Lin_Dclar @Neds_Ovrid(NEds=No)
					default void Mod_Short2$1_By_Point_Sorc(By_Typ By,Short2$1 Fun,Point$Short<By_Typ> B)
					{Set_Short2$1_By_Point_Sorc(By,Fun,this,B);}
	
	@Lin_Dclar @Neds_Ovrid(NEds=No)
	default short SGet_Short_By_Point(By_Typ By,short Valu)
	{
		short Stor=Get_Short_By_Point(By);
		Set_Short_By_Point(By,Valu);

		return Stor;
	}
}