package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Byt_By_Point;
import CC.Util.By.LMNt.Set_Byt_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Point;
import CC.$.Q$Q.Byt$Byt;
import CC.$.Q$Q.Point$Byt;
import CC.$.Q2$.Point_Byt$;
import CC.$.Q2$1.Byt2$1;

public interface Set_Byt_By_Point<By_Typ,From_Typ> extends
		Get_Byt_By_Point<By_Typ>,
		Set_Byt_By_Q<From_Typ>,
		Set_Q_By_Point<By_Typ,From_Typ>,
		Point_Byt$<By_Typ>
{
	@Lin_Dclar void Set_Byt_By_Point(By_Typ By,byte Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Point_Byt$(By_Typ By,byte Valu){Set_Byt_By_Point(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt_By_Point_Sorc(By_Typ By,Point$Byt Sorc){Set_Byt_By_Point(By,Sorc.Point$Byt(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt1$1_By_Point(By_Typ By,Byt$Byt Fun,byte Valu)
		{Set_Byt_By_Point(By,Fun.Byt$Byt(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Byt1$1_By_Point_Sorc(By_Typ By,Byt$Byt Fun,Point$Byt Sorc)
			{Set_Byt1$1_By_Point(By,Fun,Sorc.Point$Byt(By));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Mod_Byt1$1_By_Point(By_Typ By,Byt$Byt Fun)
			{Set_Byt1$1_By_Point_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt2$1_By_Point(By_Typ By,Byt2$1 Fun,byte A,byte B)
		{Set_Byt_By_Point(By,Fun.Byt2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Byt2$1_By_Point_SLit(By_Typ By,Byt2$1 Fun,Point$Byt<By_Typ> A,byte B)
			{Set_Byt2$1_By_Point(By,Fun,A.Point$Byt(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Byt2$1_By_Point(By_Typ By,Byt2$1 Fun,byte B)
				{Set_Byt2$1_By_Point_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Byt2$1_By_Point_Sorc(By_Typ By,Byt2$1 Fun,Point$Byt<By_Typ> A,Point$Byt<By_Typ> B)
				{Set_Byt2$1_By_Point_SLit(By,Fun,A,B.Point$Byt(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Byt2$1_By_Point_Sorc(By_Typ By,Byt2$1 Fun,Point$Byt<By_Typ> B)
					{Set_Byt2$1_By_Point_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default byte SGet_Byt_By_Point(By_Typ By,byte Valu)
	{
		byte Stor=Get_Byt_By_Point(By);
		Set_Byt_By_Point(By,Valu);

		return Stor;
	}
}